package mac.com.sampleproffesionalapp.Model;

/**
 * Created by Ankitkumar on 5/12/2016.
 */
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class SampleModel {

    @SerializedName("DefinitionSource")
    @Expose
    private String DefinitionSource;
    @SerializedName("Heading")
    @Expose
    private String Heading;
    @SerializedName("ImageWidth")
    @Expose
    private Integer ImageWidth;
    @SerializedName("RelatedTopics")
    @Expose
    private List<RelatedTopic> RelatedTopics = new ArrayList<RelatedTopic>();

    /**
     *
     * @return
     * The DefinitionSource
     */
    public String getDefinitionSource() {
        return DefinitionSource;
    }

    /**
     *
     * @param DefinitionSource
     * The DefinitionSource
     */
    public void setDefinitionSource(String DefinitionSource) {
        this.DefinitionSource = DefinitionSource;
    }

    /**
     *
     * @return
     * The Heading
     */
    public String getHeading() {
        return Heading;
    }

    /**
     *
     * @param Heading
     * The Heading
     */
    public void setHeading(String Heading) {
        this.Heading = Heading;
    }

    /**
     *
     * @return
     * The ImageWidth
     */
    public Integer getImageWidth() {
        return ImageWidth;
    }

    /**
     *
     * @param ImageWidth
     * The ImageWidth
     */
    public void setImageWidth(Integer ImageWidth) {
        this.ImageWidth = ImageWidth;
    }

    /**
     *
     * @return
     * The RelatedTopics
     */
    public List<RelatedTopic> getRelatedTopics() {
        return RelatedTopics;
    }

    /**
     *
     * @param RelatedTopics
     * The RelatedTopics
     */
    public void setRelatedTopics(List<RelatedTopic> RelatedTopics) {
        this.RelatedTopics = RelatedTopics;
    }

}