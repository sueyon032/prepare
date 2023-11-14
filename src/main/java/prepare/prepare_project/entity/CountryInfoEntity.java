package prepare.prepare_project.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import prepare.prepare_project.dto.CountryInfoDTO;

import java.sql.Blob;

@Entity
@Setter
@Getter
@Table(name = "country_info") //database에 해당 이름의 테이블 생성
public class CountryInfoEntity { //table 역할
    //jpa ==> database를 객체처럼 사용 가능

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;

    @Column(unique = true)
    private String cName; // 메인/나라이름

    @Column
    private String cImg; // 메인/나라사진

    @Column
    private String cArea; // 메인/나라대륙

    @Column
    private Integer lLeft; // 메인/나라위치
    @Column
    private Integer lTop; // 메인/나라위치

     @Column
     private String bInfo; // 기본정보

      @Column
      private String pFight; // 여행준비/항공

      @Column
      private String pVisa; // 여행준비/비자

      @Column
      private Double pRate; // 여행준비/환율

      @Column
      private String pPrice; // 여행준비/물가

      @Column
      private String pTime; // 여행준비/시차

      @Column
      private String rPlaceImg; // 여행지추천/나라이미지

      @Column
      private String rPlaceName; // 여행지추천/나라이름

    public static CountryInfoEntity toCountryInfoEntity(CountryInfoDTO countryInfoDTO){
        CountryInfoEntity countryInfoEntity = new CountryInfoEntity();
        countryInfoEntity.setId(countryInfoDTO.getId());
        countryInfoEntity.setCName(countryInfoDTO.getCName());
        countryInfoEntity.setCArea(countryInfoDTO.getCArea());
        countryInfoEntity.setLLeft(countryInfoDTO.getLLeft());
        countryInfoEntity.setLTop(countryInfoDTO.getLTop());

        countryInfoEntity.setBInfo(countryInfoDTO.getBInfo());

        countryInfoEntity.setPFight(countryInfoDTO.getPFight());
        countryInfoEntity.setPVisa(countryInfoDTO.getPVisa());
        countryInfoEntity.setPRate(countryInfoDTO.getPRate());
        countryInfoEntity.setPPrice(countryInfoDTO.getPPrice());
        countryInfoEntity.setPTime(countryInfoDTO.getPTime());

        countryInfoEntity.setRPlaceImg(countryInfoDTO.getRPlaceImg());
        countryInfoEntity.setRPlaceName(countryInfoDTO.getRPlaceName());


        return countryInfoEntity;
    }

}