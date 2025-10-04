class Tape extends DomainObject
    {
    public Movie movie() {
    	return _movie;
    }
    public Tape(String serialNumber, Movie movie) {
    	_serialNumber = serialNumber;
    	_movie = movie;
    }
    private String _serialNumber;
    public String get_serialNumber() {
        return _serialNumber;
    }
    public void set_serialNumber(String _serialNumber) {
        this._serialNumber = _serialNumber;
    }
    private Movie _movie;
    }
