package pl.wojtyna.trainings.recipes.citybike.solution.tracking.infra;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.wojtyna.trainings.recipes.citybike.solution.tracking.api.event.handlers.ReservationEventHandler;
import pl.wojtyna.trainings.recipes.citybike.solution.tracking.domain.BikeLocationTrackingService;

@Configuration
public class SpringTrackingContextConfig {

    @Bean
    public SpringLocalEventHandlerAdapter springLocalEventHandlerAdapter(ReservationEventHandler reservationEventHandler) {
        return new SpringLocalEventHandlerAdapter(reservationEventHandler);
    }

    @Bean
    public BikeLocationTrackingService bikeLocationTrackingService() {
        return new BikeLocationTrackingService();
    }

    @Bean
    public ReservationEventHandler reservationEventHandler(BikeLocationTrackingService bikeLocationTrackingService) {
        return new ReservationEventHandler(bikeLocationTrackingService);
    }
}
