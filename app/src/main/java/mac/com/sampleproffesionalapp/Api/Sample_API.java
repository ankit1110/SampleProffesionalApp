package mac.com.sampleproffesionalapp.Api;

import java.util.List;


import mac.com.sampleproffesionalapp.Model.SampleModel;
import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by kalpesh on 04/09/2015.
 */
public interface Sample_API {
    @GET("/?q=simpsons+characters&format=json")
    public void getData(Callback<List<SampleModel>> response);
}
