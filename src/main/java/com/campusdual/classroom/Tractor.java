package com.campusdual.classroom;

public class Tractor implements  IMachine{

	protected int horsePower = 0;

	public Tractor(int hp) {
		this.horsePower = hp;
	}

	public void forward() {
		System.out.println("El tractor avanza");
	}

	public void backward() {
		System.out.println("El tractor retrocede");
	}

	@Override
	public void start() {
		System.out.println("el vehiculo tractor esta encendido");
	}

	@Override
	public void stop() {
		System.out.println("el vehiculo tractor esta apagado");
	}

	@Override
	public void maintenance() {
		System.out.println("el vehiculo tractor esta en mantenimiento");
	}
}
