package com.cgc.sx.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.baidu.mapapi.map.MapView;

public class DashboardViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MapView mMapView;

    public DashboardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");

    }

    public LiveData<String> getText() {
        return mText;
    }
}