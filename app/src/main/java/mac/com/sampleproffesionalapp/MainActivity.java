package mac.com.sampleproffesionalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

import mac.com.sampleproffesionalapp.Api.Sample_API;
import mac.com.sampleproffesionalapp.Model.SampleModel;
import mac.com.sampleproffesionalapp.URL.URL1;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RestAdapter rest=new RestAdapter.Builder()
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint(URL1.BASE_URL)
                .build();
        //
        Sample_API Icall = rest.create(Sample_API.class);

        Icall.getData(new Callback<List<SampleModel>>() {
            @Override
            public void success(List<SampleModel> sampleModels, Response response) {

                for(int i=0;i<sampleModels.size();i++)
                {
                    SampleModel model= sampleModels.get(i);

                    Log.i("List", "" + model.getRelatedTopics().get(i));

//Fill the adapter


                }

            }

            @Override
            public void failure(RetrofitError error)
            {
                Toast.makeText(getApplicationContext(),error.toString(),Toast.LENGTH_SHORT).show();
            }
        });




    }
}
