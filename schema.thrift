namespace java com.yobennett.lambdaarchitectures.gallop.schema

union HorseID {
	1: i64 horse_id;
}

union MonitorID {
	1: i64 monitor_id;
}

struct ActivityEdge {
	1: required HorseID horse;
	2: required MonitorID monitor;
	3: required i32 intensity;
	4: required i32 time;
	5: required i64 nonce;
}

enum GenderType {
	MALE = 1,
	FEMALE = 2
}

enum BreedType {
	AMERICAN_PAINT = 1,
	AMERICAN_QUARTER = 2,
	AMERICAN_SADDLEBRED = 3,
	AMERICAN_STANDARDBRED = 4,
	APPALOOSA = 5,
	ARABIAN = 6,
	CLYDESDALE = 7,
	HANOVERIAN = 8,
	MISSISSIPPI_FOX_TROTTER = 9,
	MORGAN = 10,
	PALOMINO = 11,
	PERUVIAN_PASO = 12,
	TENNESSEE_WALKING = 13,
	THOROUGHBRED = 14,
	PINTO = 15,
	MUSTANG = 16
}

union HorsePropertyValue {
	1: string name;
	2: double weight;
	3: GenderType gender;
	4: BreedType breed;
}

struct HorseProperty {
	1: required HorseID id;
	2: required HorsePropertyValue property;
}

enum MonitorType {
	ACTIVITY = 1
}

union MonitorPropertyValue {
	1: MonitorType type;
}

struct MonitorProperty {
	1: required MonitorID id;
	2: required MonitorPropertyValue property;
}

union DataUnit {
	1: HorseProperty horse_property;
	2: MonitorProperty monitor_property;
	3: ActivityEdge activity;
}

struct Pedigree {
	1: required i32 true_as_of_secs;
}

struct Data {
	1: required Pedigree pedigree;
	2: required DataUnit dataUnit;
}