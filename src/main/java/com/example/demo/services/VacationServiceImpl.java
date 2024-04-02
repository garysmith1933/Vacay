
public class VacationServiceImpl implements VacatiionService {
  private VacationRepository vacationRepository;

  public VacatiionServiceImpl(VacationRepository vacationRepository) {
    this.vacationRepository = vacationRepository;
  }

  public List<Vacation> fetch_vacations() {
    return this.vacationRepository.findAll();
  }
}