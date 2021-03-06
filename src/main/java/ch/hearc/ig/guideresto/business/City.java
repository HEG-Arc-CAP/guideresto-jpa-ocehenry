package ch.hearc.ig.guideresto.business;
//Done
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "VILLES")
public class City {
    @Id
    @Column(name = "NUMERO")
    private Integer id;
    @Column(name = "CODE_POSTAL")
    private String zipCode;
    @Column (name = "NOM_VILLE")
    private String cityName;

    @OneToMany
    @JoinColumn(name ="FK_VILL")
    private Set<Restaurant> restaurants;

    public City() {
        this(null, null);
    }

    public City(String zipCode, String cityName) {
        this(null, zipCode, cityName);
    }
    
    public City(Integer id, String zipCode, String cityName) {
        this.id = id;
        this.zipCode = zipCode;
        this.cityName = cityName;
        this.restaurants = new HashSet();
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String city) {
        this.cityName = city;
    }

    public Set<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(Set<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }
}