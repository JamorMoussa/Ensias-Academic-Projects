import numpy as np
import matplotlib.pyplot as plt

def hs(w, xi):
    return np.sign(np.dot(w, xi))

def idx(w, xi, yi):
    return 0 if hs(w, xi) == yi else 1

def Ls(w, X, y):
    return (1/len(X)) * np.sum([idx(w, xi, y[i]) for i , xi in enumerate(X)])


def Pocket(w0, X, y, Tmax=1e3):
    t = 0
    w = np.copy(w0)
    loss = Ls(w, X, y)
    loss_hist = [loss]

    while(t < Tmax):
        for i, xi in enumerate(X):
            if hs(w, xi) * y[i] <= 0:
                w += y[i]*xi
        t += 1
        loss = Ls(w, X, y)
        if not t%50:
            loss_hist.append(loss)
    t = t//50
    return w, loss, loss_hist, t


if __name__ == "__main__":
   import data, plot
   np.random.seed(3)
   X_train, y_train = data.data_gener(
       n_samples=120, 
       cluster_std=1.7,
       random_state=2
   )

   w0 = np.random.random(X_train.shape[1])

   w_pocket, loss, loss_hist, t = Pocket(
       w0 = w0, 
       X= X_train, 
       y= y_train,
       Tmax= 1e3
    )

   print("#"*70)
   print("# weights : ", w_pocket)
   print("# loss : ", loss)
   print("# number of iteration : ", t)
   print("#"*70)

   #plot.plot_2D(w_pocket, X_train, y_train, label="Pocket")
   
   plot.plot_2D(
        w=w_pocket,
        X=X_train, 
        y=y_train, 
        label="pocket", 
        loss_hist=loss_hist,
        iters = t
    )