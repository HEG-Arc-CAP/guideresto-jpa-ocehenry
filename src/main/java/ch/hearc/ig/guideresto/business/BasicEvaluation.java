package ch.hearc.ig.guideresto.business;
//Done
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name = "LIKES")
public class BasicEvaluation extends Evaluation {
    @Column (name ="APPRECIATION") // Boolean / String ?
    private boolean likeRestaurant;
    @Column (name = "ADRESSE_IP")
    private String ipAddress;

    public BasicEvaluation() {
        this(null, null, false, null);
    }

    public BasicEvaluation(Date visitDate, Restaurant restaurant, boolean likeRestaurant, String ipAddress) {
        this(null, visitDate, restaurant, likeRestaurant, ipAddress);
    }
    
    public BasicEvaluation(Integer id, Date visitDate, Restaurant restaurant, boolean likeRestaurant, String ipAddress) {
        super(id, visitDate, restaurant);
        this.likeRestaurant = likeRestaurant;
        this.ipAddress = ipAddress;
    }

    public boolean isLikeRestaurant() {
        return likeRestaurant;
    }

    public void setLikeRestaurant(boolean likeRestaurant) {
        this.likeRestaurant = likeRestaurant;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

}
