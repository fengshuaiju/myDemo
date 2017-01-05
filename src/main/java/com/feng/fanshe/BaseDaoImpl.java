package com.feng.fanshe;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class BaseDaoImpl<T> implements BaseDao<T>{

	private Class<?> clazz = null;
	
	public BaseDaoImpl(){
		Type genericSuperclass = getClass().getGenericSuperclass();
		
		if(genericSuperclass instanceof ParameterizedType){
			ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
			Type rawType = parameterizedType.getRawType();
			Type ownerType = parameterizedType.getOwnerType();
			try {
				clazz = Class.forName(rawType.getTypeName());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("rawType : " + rawType + "------------" + "ownerType : " + ownerType);
		}else{
			try {
				clazz = Class.forName(genericSuperclass.getTypeName());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(genericSuperclass.getTypeName());
		}
	}

	
	@Override
	public T getFirstOne() {
		System.out.println("---------------" + clazz.getName());
		return null;
	}
	
	
}
