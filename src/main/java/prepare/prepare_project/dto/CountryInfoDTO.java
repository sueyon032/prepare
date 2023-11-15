package prepare.prepare_project.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import prepare.prepare_project.entity.CountryInfoEntity;

import java.sql.Blob;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class CountryInfoDTO {
    private Long id;
    private String cName;
    private String cImg;    // path
    private String cArea;

    private Integer LLeft;
    private Integer LTop;

    private String bInfo;
    // private String bFlag;

    private String pFight;
    private String pVisa;
    private Double pRate;
    private String pPrice;
    private String pTime;


    private String rPlaceImg;
    private String rPlaceName;
//    private String rPlaceImg1;
//    private String rPlaceName1;
//    private String rPlaceImg2;
//    private String rPlaceName2;
//    private String rPlaceImg3;
//    private String rPlaceName3;


    public static CountryInfoDTO toCountryInfoDTO(CountryInfoEntity countryInfoEntity){
        CountryInfoDTO countryInfoDTO = new CountryInfoDTO();
        countryInfoDTO.setId(countryInfoEntity.getId());
        countryInfoDTO.setCName(countryInfoEntity.getCName());
        countryInfoDTO.setCImg(countryInfoEntity.getCImg());
        countryInfoDTO.setCArea(countryInfoEntity.getCArea());
        countryInfoDTO.setLLeft(countryInfoEntity.getLLeft());
        countryInfoDTO.setLTop(countryInfoEntity.getLTop());

        countryInfoDTO.setBInfo(countryInfoEntity.getBInfo());

        countryInfoDTO.setPFight(countryInfoEntity.getPFight());
        countryInfoDTO.setPVisa(countryInfoEntity.getPVisa());
        countryInfoDTO.setPRate(countryInfoEntity.getPRate());
        countryInfoDTO.setPPrice(countryInfoEntity.getPPrice());
        countryInfoDTO.setPTime(countryInfoEntity.getPTime());

        countryInfoDTO.setRPlaceImg(countryInfoEntity.getRPlaceImg());
        countryInfoDTO.setRPlaceName(countryInfoEntity.getRPlaceName());

        return countryInfoDTO;
    }
}