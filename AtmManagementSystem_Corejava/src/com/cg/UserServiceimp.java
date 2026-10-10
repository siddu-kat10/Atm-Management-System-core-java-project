package com.cg;

import java.util.HashMap;

public class UserServiceimp implements UserService{
	HashMap<String,User>map=new HashMap<String, User>();
	public UserServiceimp() {
		map.put("Sai", new User("Sai","9603",90000));
		map.put("Mahi",new User("Mahi","9866",84554));
	}

	@Override
	public User login(String UserId, String Pin) throws InvalidPinException {
		// TODO Auto-generated method stub
		User u=map.get(UserId);
		if(u==null||u.getPin() == Pin) {
			throw new InvalidPinException("Invalid UserId or Pin");
		}
		return u;
	}

}
