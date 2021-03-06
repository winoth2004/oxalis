package eu.peppol.statistics;

/**
 * User: steinar
 * Date: 07.02.13
 * Time: 22:26
 */
public interface StatisticsRepositoryFactory {
    RawStatisticsRepository getInstanceForRawStatistics();

    AggregatedStatisticsRepository getInstanceForAggregatedStatistics();
}
