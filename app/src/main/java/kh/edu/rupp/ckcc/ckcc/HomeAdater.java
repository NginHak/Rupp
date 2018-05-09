package kh.edu.rupp.ckcc.ckcc;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeAdater extends RecyclerView.Adapter<EventAdater.EventViewHolder> {
    @NonNull
    @Override
    public EventAdater.EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.view_holder_event_1, parent, false);
        EventAdater.EventViewHolder viewHolder = new EventAdater.EventViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull EventAdater.EventViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class HomeViewHolder extends RecyclerView.ViewHolder{

        public HomeViewHolder(View itemView) {
            super(itemView);
        }
    }
}
