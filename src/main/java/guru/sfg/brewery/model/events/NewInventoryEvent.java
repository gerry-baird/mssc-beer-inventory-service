package guru.sfg.brewery.model.events;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class NewInventoryEvent extends BeerEvent{

    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
