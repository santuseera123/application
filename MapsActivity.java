package myapplicationishello.com.example.hsport.google_map;

import android.graphics.Color;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.List;

   public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap;
    LatLng position;
    @Override
      protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the Support MapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment)getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        GoogleApiClient client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }
    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
       * we just add a marker near Sydney, Australia.
       * If Google Play services is not installed on the device, the user will be prompted to install
       * it inside the SupportMapFragment. This method will only be triggered once the user has
       * installed Google Play services and returned to the app.
      */
        @Override
        public void onMapReady(GoogleMap googleMap){
            mMap = googleMap;
        // Add a marker in Sydney and move the camera
            LatLng varanasi   = new LatLng(16.5062, 80.6480);
             mMap.addMarker(new MarkerOptions().position(varanasi).title("Marker in varanasi1"));
             googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(17.3849, 78.4865), 14f));
            mMap.addMarker(new MarkerOptions().position(new LatLng(17.3849, 78.4865)).icon(BitmapDescriptorFactory.fromResource(R.drawable.ramesh)));

            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(17.3842, 78.4862), 14f));
            mMap.addMarker(new MarkerOptions().position(new LatLng(17.3842, 78.4862)).icon(BitmapDescriptorFactory.fromResource(R.drawable.anusha)));

            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(17.3840, 78.4861), 14f));
            mMap.addMarker(new MarkerOptions().position(new LatLng(17.3840, 78.4861)).icon(BitmapDescriptorFactory.fromResource(R.drawable.dj)));

            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(17.3844, 78.4864), 14f));
            mMap.addMarker(new MarkerOptions().position(new LatLng(17.3844, 78.4864)).icon(BitmapDescriptorFactory.fromResource(R.drawable.mahesh)));

            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(17.3851, 78.4869), 14f));
            mMap.addMarker(new MarkerOptions().position(new LatLng(17.3851, 78.4869)).icon(BitmapDescriptorFactory.fromResource(R.drawable.pavan)));

            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(17.3853, 78.4870), 14f));
            mMap.addMarker(new MarkerOptions().position(new LatLng(17.3853, 78.4870)).icon(BitmapDescriptorFactory.fromResource(R.drawable.prasanna)));

            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(17.3855, 78.4868), 14f));
            mMap.addMarker(new MarkerOptions().position(new LatLng(17.3855, 78.4868)).icon(BitmapDescriptorFactory.fromResource(R.drawable.praveen)));

            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(17.3858, 78.4869), 14f));
            mMap.addMarker(new MarkerOptions().position(new LatLng(17.3858, 78.4869)).icon(BitmapDescriptorFactory.fromResource(R.drawable.ramakrishna)));

            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(17.3845, 78.4860), 14f));
            mMap.addMarker(new MarkerOptions().position(new LatLng(17.3845, 78.4860)).icon(BitmapDescriptorFactory.fromResource(R.drawable.ravi)));

            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(17.3843, 78.4863), 14f));
            mMap.addMarker(new MarkerOptions().position(new LatLng(17.3843, 78.4863)).icon(BitmapDescriptorFactory.fromResource(R.drawable.suresh)));


            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(17.3841, 78.4851), 14f));
            mMap.addMarker(new MarkerOptions().position(new LatLng(17.3841, 78.4851)).icon(BitmapDescriptorFactory.fromResource(R.drawable.wine)));

            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(17.3839, 78.4858), 14f));
            mMap.addMarker(new MarkerOptions().position(new LatLng(17.3839, 78.4858)).icon(BitmapDescriptorFactory.fromResource(R.drawable.redman)));


            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(17.3838, 78.4855), 14f));
            mMap.addMarker(new MarkerOptions().position(new LatLng(17.3838, 78.4855)).icon(BitmapDescriptorFactory.fromResource(R.drawable.post)));

            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(17.3837, 78.4853), 14f));
            mMap.addMarker(new MarkerOptions().position(new LatLng(17.3837, 78.4853)).icon(BitmapDescriptorFactory.fromResource(R.drawable.pakistan)));

            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(17.3836, 78.4856), 14f));
            mMap.addMarker(new MarkerOptions().position(new LatLng(17.3836, 78.4856)).icon(BitmapDescriptorFactory.fromResource(R.drawable.india)));

            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(17.3835, 78.4858), 14f));
            mMap.addMarker(new MarkerOptions().position(new LatLng(17.3835, 78.4858)).icon(BitmapDescriptorFactory.fromResource(R.drawable.glass)));

            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(17.3834, 78.4854), 14f));
            mMap.addMarker(new MarkerOptions().position(new LatLng(17.3834, 78.4854)).icon(BitmapDescriptorFactory.fromResource(R.drawable.drink)));

            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(17.3848, 78.4852), 14f));
            mMap.addMarker(new MarkerOptions().position(new LatLng(17.3848, 78.4852)).icon(BitmapDescriptorFactory.fromResource(R.drawable.it)));

            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(17.3846, 78.4856), 14f));
            mMap.addMarker(new MarkerOptions().position(new LatLng(17.3846, 78.4856)).icon(BitmapDescriptorFactory.fromResource(R.drawable.blackman)));

            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(17.3843, 78.4853), 14f));
            mMap.addMarker(new MarkerOptions().position(new LatLng(17.3843, 78.4853)).icon(BitmapDescriptorFactory.fromResource(R.drawable.amlence)));


            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(17.3830, 78.4850), 14f));
            mMap.addMarker(new MarkerOptions().position(new LatLng(17.3830, 78.4850)).icon(BitmapDescriptorFactory.fromResource(R.drawable.aero)));
        }
}