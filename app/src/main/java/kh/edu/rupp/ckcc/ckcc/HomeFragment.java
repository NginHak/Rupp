package kh.edu.rupp.ckcc.ckcc;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View fragmentHome = inflater.inflate(R.layout.fragment_home, container, false);
        return fragmentHome;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView rclHome = view.findViewById(R.id.rcl_home);
        RecyclerView.LayoutManager layoutManager =  new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        rclHome.setLayoutManager(layoutManager);

        EventAdater adater = new EventAdater();
        rclHome.setAdapter(adater);
    }
}
