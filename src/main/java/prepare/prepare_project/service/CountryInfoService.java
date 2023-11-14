package prepare.prepare_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prepare.prepare_project.entity.CountryInfoEntity;
import prepare.prepare_project.repository.CountryInfoRepository;

import java.util.List;

@Service
public class CountryInfoService {
    @Autowired
    private CountryInfoRepository countryInfoRepository;

    public List<CountryInfoEntity> getAllCountryInfo() {
        return countryInfoRepository.findAll();
    }
}
