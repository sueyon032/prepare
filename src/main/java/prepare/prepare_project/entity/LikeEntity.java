package prepare.prepare_project.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "like_entity")
public class LikeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // other fields...

    @ManyToOne
    @JoinColumn(name = "join_id")
    private JoinEntity joinEntity;

    @ManyToOne
    @JoinColumn(name = "country_info_id")
    private CountryInfoEntity countryInfoEntity;

    // constructors, getters, setters...

    // Method to create a new LikeEntity
    public static LikeEntity createLike(JoinEntity joinEntity, CountryInfoEntity countryInfoEntity) {
        LikeEntity likeEntity = new LikeEntity();
        likeEntity.setJoinEntity(joinEntity);
        likeEntity.setCountryInfoEntity(countryInfoEntity);
        // set other fields as needed
        return likeEntity;
    }
}
