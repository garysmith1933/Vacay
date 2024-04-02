
public class VacationServiceImpl implements VacatiionService {

  @Autowired
  private VacationRepository vacationRepository;

  public VacatiionServiceImpl(VacationRepository vacationRepository) {
    this.vacationRepository = vacationRepository;
  }

  @Override
  public List<Vacation> fetch_vacations() {
    return this.vacationRepository.findAll();
  }
}