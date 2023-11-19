package prepare.prepare_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prepare.prepare_project.entity.CountryInfoEntity;
import prepare.prepare_project.repository.CountryInfoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CountryInfoService {

    private final CountryInfoRepository countryInfoRepository;

    @Autowired
    public CountryInfoService(CountryInfoRepository countryInfoRepository) {
        this.countryInfoRepository = countryInfoRepository;
    }

    public List<CountryInfoEntity> getAllCountryInfo() {
        return countryInfoRepository.findAll();
    }

    public Optional<CountryInfoEntity> getCountryInfoById(Long id) {
        return countryInfoRepository.findById(id);
    }

    // Add more methods as needed

}

