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

    private String bCapital;
    private String bLanguage;
    private String bMoney;
    private String bClimate;
    private String bReligion;
    private String bFlag;

    private String pFlight;
    private String pVisa;
    private Double pRate;
    private String pPrice;
    private String pTime;

    private String rPlaceImg1;
    private String rPlaceName1;
    private String rPlaceImg2;
    private String rPlaceName2;
    private String rPlaceImg3;
    private String rPlaceName3;


    public static CountryInfoDTO toCountryInfoDTO(CountryInfoEntity countryInfoEntity){
        CountryInfoDTO countryInfoDTO = new CountryInfoDTO();
        countryInfoDTO.setId(countryInfoEntity.getId());
        countryInfoDTO.setCName(countryInfoEntity.getCName());
        countryInfoDTO.setCImg(countryInfoEntity.getCImg());
        countryInfoDTO.setCArea(countryInfoEntity.getCArea());
        countryInfoDTO.setLLeft(countryInfoEntity.getLLeft());
        countryInfoDTO.setLTop(countryInfoEntity.getLTop());

        countryInfoDTO.setBCapital(countryInfoEntity.getBCapital());
        countryInfoDTO.setBLanguage(countryInfoEntity.getBLanguage());
        countryInfoDTO.setBMoney(countryInfoEntity.getBMoney());
        countryInfoDTO.setBClimate(countryInfoEntity.getBClimate());
        countryInfoDTO.setBReligion(countryInfoEntity.getBReligion());
        countryInfoDTO.setBFlag(countryInfoEntity.getBFlag());

        countryInfoDTO.setPFlight(countryInfoEntity.getPFlight());
        countryInfoDTO.setPVisa(countryInfoEntity.getPVisa());
        countryInfoDTO.setPRate(countryInfoEntity.getPRate());
        countryInfoDTO.setPPrice(countryInfoEntity.getPPrice());
        countryInfoDTO.setPTime(countryInfoEntity.getPTime());

        countryInfoDTO.setRPlaceImg1(countryInfoEntity.getRPlaceImg1());
        countryInfoDTO.setRPlaceName1(countryInfoEntity.getRPlaceName1());
        countryInfoDTO.setRPlaceImg2(countryInfoEntity.getRPlaceImg2());
        countryInfoDTO.setRPlaceName2(countryInfoEntity.getRPlaceName2());
        countryInfoDTO.setRPlaceImg3(countryInfoEntity.getRPlaceImg3());
        countryInfoDTO.setRPlaceName3(countryInfoEntity.getRPlaceName3());


        return countryInfoDTO;
    }
}