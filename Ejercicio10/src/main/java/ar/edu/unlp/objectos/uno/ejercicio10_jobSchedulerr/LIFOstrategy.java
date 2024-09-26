package ar.edu.unlp.objectos.uno.ejercicio10_jobSchedulerr;

import java.util.List;

public class LIFOstrategy implements Strategy {

	@Override
	public JobDescription applyStrategy(List<JobDescription> jobs) {
		return jobs.get(jobs.size()-1);
	}
	
}
