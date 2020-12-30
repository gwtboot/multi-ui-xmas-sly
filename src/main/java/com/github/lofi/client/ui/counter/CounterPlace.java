package com.github.lofi.client.ui.counter;

import com.dncomponents.client.views.appview.AbstractActivity;
import com.dncomponents.client.views.appview.DefaultActivity;
import com.dncomponents.client.views.appview.Place;

public class CounterPlace extends Place {

	public static final class CounterPlaceRegister extends PlaceRegister<CounterPlace> {

		public static CounterPlaceRegister instance = new CounterPlaceRegister();

		private CounterPlaceRegister() {
		}

		private static final String TOKEN = "counter";

		@Override
		public String getHistoryToken() {
			return TOKEN;
		}

		@Override
		public CounterPlace getPlaceFromToken(String token) {
			return new CounterPlace();
		}

		@Override
		public String getTokenFromPlace(CounterPlace place) {
			return TOKEN;
		}

		@Override
		public AbstractActivity<?, ?> getActivity(CounterPlace place) {
			return new DefaultActivity(CounterViewImpl.getInstance(), place);
		}

		@Override
		public Class<? extends Place> forPlace() {
			return CounterPlace.class;
		}
	}

}
