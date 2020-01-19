

public class User {
	
	private String model;
	private String colour;
	private String nameDriver;
	private int carNumber;
	private int enginePower;
	private int id;

	private User(Builder builder) {
		this.model = builder.model;
		this.colour = builder.colour;
		this.nameDriver = builder.nameDriver;
		this.carNumber = builder.carNumber;
		this.enginePower = builder.enginePower;
		this.id = builder.id;
	}

	public static class Builder {
		private String model;
		private String colour;
		private String nameDriver;
		private int carNumber;
		private int enginePower;
		private int id;

		public Builder model(String model) {
			this.model = model;
			return this;
		}
		public Builder colour(String colour) {
			this.colour = colour;
			return this;
		}
		public Builder nameDriver(String nameDriver) {
			this.nameDriver = nameDriver;
			return this;
		}
		public Builder carNumber(int carNumber) {
			this.carNumber = carNumber;
			return this;
		}
		public Builder enginePower(int enginePower) {
			this.enginePower = enginePower;
			return this;
		}
		public Builder id(int id) {
			this.id = id;
			return this;
		}
		
		public User build() {
			if (isEmptyCredentials()) {
				throw new EmptyCredentialsException("Пустое имя или модель");
			}
			return new User(this);
		}

		private boolean isEmptyCredentials() {
			return this.nameDriver == null ||
					this.nameDriver.equals("") ||
					this.model == null ||
					this.model.equals("");
		}
	}

	public static Builder builder() {
		return new Builder();
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}
	public void setColou(String colour) {
		this.colour = colour;
	}

	public String getNameDriver() {
		return nameDriver;
	}
	public void setNameDriver(String NameDriver) {
		this.nameDriver = nameDriver;
	}

	public int getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(int CarNumber) {
		this.carNumber = carNumber;
	}

	public int getEnginePower() {
		return enginePower;
	}
	public void setEnginePower(int EnginePower) {
		this.enginePower = enginePower;
	}

	public int getId() {
		return id;
	}
	public void setId(int Id) {
		this.id = id;
	}

	public String toString() {
		return id + "|"
				+ nameDriver + "|"
				+ model + "|"
				+ carNumber + "|"
				+ colour + "|"
				+ enginePower;
	}
}