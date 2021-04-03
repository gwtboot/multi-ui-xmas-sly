package com.github.lofi.client.ui.todo;

import com.dncomponents.client.views.appview.AbstractActivity;
import com.dncomponents.client.views.appview.DefaultActivity;
import com.dncomponents.client.views.appview.Place;

public class TodoPlace extends Place {

	public static final class TodoPlaceRegister extends PlaceRegister<TodoPlace> {

		public static TodoPlaceRegister instance = new TodoPlaceRegister();

		private TodoPlaceRegister() {
		}

		private static final String TOKEN = "todo";

		@Override
		public String getHistoryToken() {
			return TOKEN;
		}

		@Override
		public TodoPlace getPlaceFromToken(String token) {
			return new TodoPlace();
		}

		@Override
		public String getTokenFromPlace(TodoPlace place) {
			return TOKEN;
		}

		@Override
		public AbstractActivity<?, ?> getActivity(TodoPlace place) {
			return new DefaultActivity(TodoViewImpl.getInstance(), place);
		}

		@Override
		public Class<? extends Place> forPlace() {
			return TodoPlace.class;
		}
	}
}