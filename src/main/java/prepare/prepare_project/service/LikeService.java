package prepare.prepare_project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prepare.prepare_project.entity.CountryInfoEntity;
import prepare.prepare_project.entity.JoinEntity;
import prepare.prepare_project.entity.LikeEntity;
import prepare.prepare_project.repository.LikeRepository;

import java.util.List;

@Service
public class LikeService {

    @Autowired
    private LikeRepository likeRepository;

    public void saveLikedCountry(String userId, CountryInfoEntity countryInfoEntity) {
        // Implementation to save the liked country for the user
    }
}
