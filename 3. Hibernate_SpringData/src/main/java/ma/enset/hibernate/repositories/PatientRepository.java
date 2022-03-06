package ma.enset.hibernate.repositories;
import ma.enset.hibernate.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.Date;
import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long>, Pageable {
public List<Patient> findAllByMalade(boolean m);
public Page<Patient> findPatientByMalade(Boolean m , Pageable pageable);
@Query("select  p from  Patient  p where  p.DateNaissance between  :x and :y or p.nom  like :z")
List<Patient> ChercherPatient(@Param("x") Date d1 ,@Param("y") Date d2 ,@Param("z") String nom);


}
