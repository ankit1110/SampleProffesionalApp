package mac.com.sampleproffesionalapp.Model;

/**
 * Created by Ankitkumar on 5/12/2016.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class RelatedTopic {

    @SerializedName("Result")
    @Expose
    private String Result;
    @SerializedName("Icon")
    @Expose
    private mac.com.sampleproffesionalapp.Icon Icon;
    @SerializedName("FirstURL")
    @Expose
    private String FirstURL;
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
     *
     * @return
     * The Result
     */
    public String getResult() {
        return Result;
    }

    /**
     *
     * @param Result
     * The Result
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     *
     * @return
     * The Icon
     */
    public mac.com.sampleproffesionalapp.Icon getIcon() {
        return Icon;
    }

    /**
     *
     * @param Icon
     * The Icon
     */
    public void setIcon(mac.com.sampleproffesionalapp.Icon Icon) {
        this.Icon = Icon;
    }

    /**
     *
     * @return
     * The FirstURL
     */
    public String getFirstURL() {
        return FirstURL;
    }

    /**
     *
     * @param FirstURL
     * The FirstURL
     */
    public void setFirstURL(String FirstURL) {
        this.FirstURL = FirstURL;
    }

    /**
     *
     * @return
     * The Text
     */
    public String getText() {
        return Text;
    }

    /**
     *
     * @param Text
     * The Text
     */
    public void setText(String Text) {
        this.Text = Text;
    }

}