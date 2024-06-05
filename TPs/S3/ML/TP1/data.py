import numpy as np
import matplotlib.pyplot as plt


def prepare_data(X, y):
    x_ = np.hstack((np.ones((len(X), 1)), X))
    y_ = np.where(y==0, -1, 1)
    return x_, y_

def data_gener(n_samples=120, cluster_std=1, random_state=2):

    class1_mean = [2, 2]
    class2_mean = [6, 6]
    covariance = [[cluster_std, 0], [0, cluster_std]]

    class1_data = np.random.multivariate_normal(class1_mean, covariance, n_samples)
    class2_data = np.random.multivariate_normal(class2_mean, covariance, n_samples)

    class1_labels = np.zeros(n_samples)
    class2_labels = np.ones(n_samples)
    
    data = np.vstack((class1_data, class2_data))
    labels = np.hstack((class1_labels, class2_labels))
    
    shuffle_indices = np.arange(data.shape[0])
    np.random.shuffle(shuffle_indices)
    data = data[shuffle_indices]
    labels = labels[shuffle_indices]

    return prepare_data(data, labels)