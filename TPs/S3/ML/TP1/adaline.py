import numpy as np
import matplotlib.pyplot as plt

def hs(w, xi):
    return np.sign(np.dot(w, xi))

def idx(w, xi, yi):
    return 0 if hs(w, xi) == yi else 1

def MSE(w, X, y):
    return (1/len(X))*np.sum([(y[i] - hs(w, xi))**2 for i , xi in enumerate(X)])

def Gradient(w, X, y):
    return (1/len(X))*np.sum([2*xi*(y[i] - hs(w, xi)) for i , xi in enumerate(X)])

def Adaline(w0, X , y, eps = 1e-8):
    t = 0
    w = np.copy(w0)
    loss = MSE(w, X, y)
    loss_hist = [loss]

    g = Gradient(w, X, y)

    while abs(g) > eps:
        for i, xi in enumerate(X):
            ei =  y[i] - hs(w, xi)
            w += 2*ei*xi
        t += 1
        loss = MSE(w, X, y)
        g = Gradient(w, X, y)
        loss_hist.append(loss)
    
    return w, loss, loss_hist ,g, t


if __name__ == "__main__":
   import data, plot
   np.random.seed(3)

   X_train, y_train = data.data_gener(
       n_samples=120, 
       cluster_std=1.8,
       random_state=2
   )

   w0 = np.random.random(X_train.shape[1])

   w_adaline, loss, loss_hist, g, t = Adaline(
       w0 = w0, 
       X= X_train, 
       y= y_train,
       eps= 0.5
    )

   print("#"*70)
   print("# weights : ", w_adaline)
   print("# loss : ", loss)
   print("# gradient : ", g)
   print("# number of iteration : ", t)
   print("#"*70)

   #plot.plot_2D(w_adaline, X_train, y_train, label="Adaline")

   plot.plot_2D(
        w=w_adaline,
        X=X_train, 
        y=y_train, 
        label="adaline", 
        loss_hist=loss_hist,
        iters = t
    )