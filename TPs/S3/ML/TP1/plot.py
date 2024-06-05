import numpy as np
import matplotlib.pyplot as plt


def plot_2D(w, X, y, label="PLA", loss_hist=[], iters=0):
    fig, ax = plt.subplots(1, 2) 
    coef = 1

    ax[0].scatter(X[:, 1], X[:, 2], marker="o", c=y)
    
    min_x0 = np.amin(X[:, 1])
    max_x1 = np.amax(X[:, 1])
    
    x = np.linspace(min_x0, max_x1, 100)

    y = (-w[1] * x - w[0]) / w[2]
    ax[0].plot(x, y, label=label)
    ax[0].legend()

    if label=="pocket":
        coef = 50

    t = np.linspace(0, iters*coef, iters+1)
    ax[1].plot(t, loss_hist)
    ax[1].set_xlabel("Iterations")
    ax[1].set_title("empirical error graph")

    plt.show()