package via.sdj3.rabbitmqspringbootexample.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = Product.class)
public class Product implements Serializable {
    private Long id;
    private String description;
    private int numbersOfParts;
    private double weight;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date packed;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumbersOfParts() {
        return numbersOfParts;
    }

    public void setNumbersOfParts(int numbersOfParts) {
        this.numbersOfParts = numbersOfParts;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Date getPacked() {
        return packed;
    }

    public void setPacked(Date packed) {
        this.packed = packed;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", numbersOfParts=" + numbersOfParts +
                ", weight=" + weight +
                ", packed=" + packed +
                '}';
    }
}
