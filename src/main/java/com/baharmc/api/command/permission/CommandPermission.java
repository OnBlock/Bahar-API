package com.baharmc.api.command.permission;

import org.jetbrains.annotations.NotNull;

public class CommandPermission {

	public static final CommandPermission OP = new CommandPermission(PermissionNode.OP);
	
	public static final CommandPermission NONE = new CommandPermission(PermissionNode.NONE);

	@NotNull
	private final String permission;

	@NotNull
	private final PermissionNode permissionNode;

	/**
	 * Represents a single permission required to execute a command
	 * @param permission The permission node the sender requires to run this command
	 */
	private CommandPermission(@NotNull String permission) {
		this.permission = permission;
		permissionNode = PermissionNode.NULL;
	}

	/**
	 * Represents either no permission or OP status in order to run a command
	 * @param permissionNode The enumerated type of what permission is required to run this command
	 */
	private CommandPermission(@NotNull PermissionNode permissionNode) {
		permission = "";
		this.permissionNode = permissionNode;
	}

	@NotNull
	public String getPermission() {
		return permission;
	}

	@NotNull
	public PermissionNode getPermissionNode() {
		return permissionNode;
	}

	public static CommandPermission fromPermission(@NotNull String permission) {
		return new CommandPermission(permission);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		final CommandPermission other = (CommandPermission) obj;

		return (!permission.isEmpty() || other.permission.isEmpty()) &&
			permission.equals(other.permission) && permissionNode == other.permissionNode;
	}

	@Override
	public String toString() {
		if(permissionNode != PermissionNode.NULL) {
			if(permissionNode == PermissionNode.OP) {
				return "OP";
			}

			return "NONE";
		}

		return permission;
	}
	
}