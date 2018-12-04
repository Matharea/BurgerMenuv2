package fr.wildcodeschool.burgermenuv2.ui.burgerlist;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fr.wildcodeschool.burgermenuv2.R;

public class BurgerlistFragment extends Fragment {

    private BurgerlistViewModel mViewModel;

    public static BurgerlistFragment newInstance() {
        return new BurgerlistFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.burgerlist_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(BurgerlistViewModel.class);
        // TODO: Use the ViewModel
    }

}
