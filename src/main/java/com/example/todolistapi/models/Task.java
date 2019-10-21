package com.example.todolistapi.models;

import java.time.LocalDateTime;

public class Task {

	private String id;
	private String name;
	private LocalDateTime date = LocalDateTime.now();
	private StatusTask status = StatusTask.PENDING;

	public Task(String id, String name, LocalDateTime date, StatusTask status) {
		this.setId(id);
		this.setName(name);
		this.setDate(date);
		this.setStatus(status);
	}

	public StatusTask getStatus() {
		return status;
	}

	public void setStatus(StatusTask status) {
		this.status = status;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
