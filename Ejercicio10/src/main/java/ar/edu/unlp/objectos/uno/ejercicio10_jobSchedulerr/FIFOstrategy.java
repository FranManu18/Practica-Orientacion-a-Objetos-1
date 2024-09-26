package ar.edu.unlp.objectos.uno.ejercicio10_jobSchedulerr;

import java.util.List;

public class FIFOstrategy implements Strategy {


	@Override
	public JobDescription applyStrategy(List<JobDescription> jobs) {
		return jobs.get(0);
	}
}
