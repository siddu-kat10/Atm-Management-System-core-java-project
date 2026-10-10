package com.cg;

public interface UserService {
	public User login(String UserId,String Pin) throws InvalidPinException;

}
