package startactivityforresult.shawnerlsala.packagecom.bootcamplocator;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ShawnErl on 14/08/2017.
 */

public class LocationsViewHolder extends RecyclerView.ViewHolder {

    private ImageView locationImage;
    private TextView locationTitle;
    private TextView locationAddress;
    public LocationsViewHolder(View itemView) {
        super(itemView);

        //Assigning the viewholder the parts of the cardview...eg. Image, title, address etc
        locationImage = (ImageView)itemView.findViewById(R.id.location_image);
        locationTitle = (TextView)itemView.findViewById(R.id.location_title);
        locationAddress = (TextView)itemView.findViewById(R.id.location_address);
    }

    public void updateUI (Develop location){
        String uri = location.getLocationImgUrl();
        int resource = locationImage.getResources().getIdentifier(uri, null, locationImage.getContext().getPackageName());
        locationImage.setImageResource(resource);
        locationTitle.setText(location.getLocationTittle());
        locationAddress.setText(location.getLocationAddress());
    }
}

