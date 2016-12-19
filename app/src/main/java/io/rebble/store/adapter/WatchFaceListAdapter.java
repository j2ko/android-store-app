package io.rebble.store.adapter;

import java.util.List;

import io.rebble.store.BR;
import io.rebble.store.R;
import io.rebble.store.viewmodel.WatchFaceApplicationViewModel;

/**
 * Created by zhangqichuan on 15/12/16.
 */

public class WatchFaceListAdapter extends DataBindingBaseAdapter<WatchFaceApplicationViewModel> {
    public WatchFaceListAdapter(List<WatchFaceApplicationViewModel> mList) {
        super(mList);
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.item_watchface;
    }

    @Override
    protected int getBRResId() {
        return BR.watchface;
    }

}
