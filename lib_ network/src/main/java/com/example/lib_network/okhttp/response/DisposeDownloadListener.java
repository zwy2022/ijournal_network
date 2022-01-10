package com.example.lib_network.okhttp.response;

public interface DisposeDownloadListener extends DisposeDataListener {
    void onProgress(int progress);
}