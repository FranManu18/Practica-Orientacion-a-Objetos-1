package ar.edu.unlp.objectos.uno.ejercicio10_jobSchedulerr;

import java.util.List;

public interface Strategy {

	public abstract JobDescription applyStrategy(List<JobDescription> jobs);
}
