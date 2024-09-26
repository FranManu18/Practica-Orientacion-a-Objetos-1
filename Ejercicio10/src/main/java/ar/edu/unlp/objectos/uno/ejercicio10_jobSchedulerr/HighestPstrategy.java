package ar.edu.unlp.objectos.uno.ejercicio10_jobSchedulerr;

import java.util.List;

public class HighestPstrategy implements Strategy {

	
	@Override
	public JobDescription applyStrategy(List<JobDescription> jobs) {
		return jobs.stream()
                .max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
                .orElse(null);
	}
	
}
