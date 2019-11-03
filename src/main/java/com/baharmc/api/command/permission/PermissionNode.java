package com.baharmc.api.command.permission;

public enum PermissionNode {

	/**
	 * A player that has to be an operator to run a command
	 */
	OP,

	/**
	 * Command can be run with no permissions
	 */
	NONE,

	/**
	 * For null-safety
	 */
	NULL;

}