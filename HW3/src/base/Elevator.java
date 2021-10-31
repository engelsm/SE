package base;

public class Elevator {

	public static int current_Floor = 5;
	int dest_Floor;

	private Elv_States State = new Elv_States();

	public Elevator(int dest_floor) {
		this.dest_Floor = dest_floor;
		System.out.println("*** Destination floor is: " + dest_Floor);
		arrive_atFloor();

	}

	private void arrive_atFloor() {
		if (current_Floor==dest_Floor){
			System.out.println("Current State: " + State.current_State);
			System.out.println("*** Arrived at Destination Floor");
		}else if(current_Floor > dest_Floor) {
			State.current_State = State.Moving_down;
			System.out.println("Current State: " + State.current_State);
			current_Floor--;
			System.out.println("*** Currently at floor: " + current_Floor);
			arrive_atFloor();
		}else if(current_Floor < dest_Floor) {
			State.current_State = State.Moving_up;
			System.out.println("Current State: " + State.current_State);
			current_Floor++;
			System.out.println("*** Currently at floor: " + current_Floor);
			arrive_atFloor();
		}
	}

}