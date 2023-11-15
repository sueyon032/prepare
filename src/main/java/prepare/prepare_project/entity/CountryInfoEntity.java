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
    private String bCapital; // 기본정보/수도

    @Column
    private String bLanguage; // 기본정보/언어

    @Column
    private String bMoney; // 기본정보/화폐

    @Column
    private String bClimate; // 기본정보/기후

    @Column
    private String bReligion; // 기본정보/종교

    @Column
    private String bFlag; // 기본정보/국기

    @Column
    private String pFlight; // 여행준비/항공

    @Column
    private String pVisa; // 여행준비/비자

    @Column
    private Double pRate; // 여행준비/환율

    @Column
    private String pPrice; // 여행준비/물가

    @Column
    private String pTime; // 여행준비/시차

    @Column
    private String rPlaceImg1; // 여행지추천/나라이미지

    @Column
    private String rPlaceName1; // 여행지추천/나라이름

    @Column
    private String rPlaceImg2; // 여행지추천/나라이미지

    @Column
    private String rPlaceName2; // 여행지추천/나라이름

    @Column
    private String rPlaceImg3; // 여행지추천/나라이미지

    @Column
    private String rPlaceName3; // 여행지추천/나라이름

    public static CountryInfoEntity toCountryInfoEntity(CountryInfoDTO countryInfoDTO) {
        CountryInfoEntity countryInfoEntity = new CountryInfoEntity();
        countryInfoEntity.setId(countryInfoDTO.getId());
        countryInfoEntity.setCName(countryInfoDTO.getCName());
        countryInfoEntity.setCArea(countryInfoDTO.getCArea());
        countryInfoEntity.setLLeft(countryInfoDTO.getLLeft());
        countryInfoEntity.setLTop(countryInfoDTO.getLTop());

        countryInfoEntity.setBCapital(countryInfoDTO.getBCapital());
        countryInfoEntity.setBLanguage(countryInfoDTO.getBLanguage());
        countryInfoEntity.setBMoney(countryInfoDTO.getBMoney());
        countryInfoEntity.setBClimate(countryInfoDTO.getBClimate());
        countryInfoEntity.setBReligion(countryInfoDTO.getBReligion());
        countryInfoEntity.setBFlag(countryInfoDTO.getBFlag());

        countryInfoEntity.setPFlight(countryInfoDTO.getPFlight());
        countryInfoEntity.setPVisa(countryInfoDTO.getPVisa());
        countryInfoEntity.setPRate(countryInfoDTO.getPRate());
        countryInfoEntity.setPPrice(countryInfoDTO.getPPrice());
        countryInfoEntity.setPTime(countryInfoDTO.getPTime());

        countryInfoEntity.setRPlaceImg1(countryInfoDTO.getRPlaceImg1());
        countryInfoEntity.setRPlaceName1(countryInfoDTO.getRPlaceName1());
        countryInfoEntity.setRPlaceImg2(countryInfoDTO.getRPlaceImg2());
        countryInfoEntity.setRPlaceName2(countryInfoDTO.getRPlaceName2());
        countryInfoEntity.setRPlaceImg3(countryInfoDTO.getRPlaceImg3());
        countryInfoEntity.setRPlaceName3(countryInfoDTO.getRPlaceName3());


        return countryInfoEntity;
    }

}