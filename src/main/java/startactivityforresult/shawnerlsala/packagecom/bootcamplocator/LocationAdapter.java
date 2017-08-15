package startactivityforresult.shawnerlsala.packagecom.bootcamplocator;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by ShawnErl on 14/08/2017.
 */

public class LocationAdapter extends RecyclerView.Adapter<LocationsViewHolder>{
        private ArrayList<Develop> locations;
        public LocationAdapter(ArrayList<Develop> locations) {
            this.locations = locations;
        }

        @Override
        public void onBindViewHolder(LocationsViewHolder holder, int position) {
            final Develop location = locations.get(position);
            holder.updateUI(location);

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Load Details page
                }
            });
        }

        @Override
        public int getItemCount() {
            return locations.size();
        }

        @Override
        public LocationsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View card = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardlocation, parent, false);
            return new LocationsViewHolder(card);
        }

    }

