package com.cibertec.T1.service.impl;

import com.cibertec.T1.model.Patient;
import com.cibertec.T1.model.Prescription;
import com.cibertec.T1.repo.PatientRepo;
import com.cibertec.T1.repo.PrescriptionRepo;
import com.cibertec.T1.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientRepo patientRepository;

    @Autowired
    PrescriptionRepo prescriptionRepository;

    @Override
    public List<Patient> list() {
        List<Patient> listadoPatients = patientRepository.findAll();
        for(Patient patient: listadoPatients){
            double sumaCostos = 0.0;
            List<Prescription> listadoPrescription = prescriptionRepository.findByPatient_PatientId(patient.getPatientId());
            for(Prescription prescription: listadoPrescription){
                sumaCostos = sumaCostos + prescription.getPrescriptionCost();
            }
            patient.setTotalPrescriptionCost(sumaCostos);
        }
        return listadoPatients;
    }

    @Override
    public Patient add(Patient c) {
        return patientRepository.save(c);
    }

    @Override
    public Patient update(Patient c) {
        return patientRepository.save(c);
    }

    @Override
    public void delete(Long id) {
        patientRepository.deleteById(id);
    }

}