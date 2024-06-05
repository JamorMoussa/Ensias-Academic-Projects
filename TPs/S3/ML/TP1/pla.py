import numpy as np
import matplotlib.pyplot as plt

def hs(w, xi):
    return np.sign(np.dot(w, xi))

def idx(w, xi, yi):
    return 0 if hs(w, xi) == yi else 1

def Ls(w, X, y):
    return (1/len(X)) * np.sum([idx(w, xi, y[i]) for i , xi in enumerate(X)])


def Pla(w0, X, y):
    t = 0
    w = np.copy(w0)
    loss = Ls(w, X, y)
    loss_hist = [loss, ]

    while(loss!= 0):
        for i, xi in enumerate(X):
            if hs(w, xi) * y[i] <= 0:
                w += y[i]*xi
        t += 1
        loss = Ls(w, X, y)
        loss_hist.append(loss)
    return w, loss, np.array(loss_hist), t


if __name__ == "__main__":
   import data, plot
   np.random.seed(2)
   X_train, y_train = data.data_gener(
       n_samples=120, 
       cluster_std=0.8,
       random_state=2
   )

   w0 = np.random.random(X_train.shape[1])

   w_pla, loss, loss_hist ,t = Pla(w0, X_train, y_train)

   print("#"*70)
   print("# weights : ", w_pla)
   print("# loss : ", loss)
   print("# number of iteration : ", t)
   print("#"*70)

   plot.plot_2D(
                w=w_pla,
                X=X_train, 
                y=y_train, 
                label="pla", 
                loss_hist=loss_hist,
                iters = t
            )