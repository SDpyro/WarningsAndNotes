WarningsAndNotes
================

A user warnings &amp; notes system for bukkit/MineCraft

<h3>Proposed Functionality</h3>
<table>
	<tr>
		<th>Command</th><th>Shortcut</th><th>Permission</th><th>Description</th><th>Status</th>
	</tr>
	<tr>
		<td>/warn [perm] username reason</td><td>N/A</td><td>wan.warn</td><td>Warn the user for given reason. Optionally include a permission level required to view the warning.</td><td>N</td>
	</tr>
	<tr>
		<td>/warnings [username]</td><td>N/A</td><td>wan.check</td><td>Check warnings of invoker. If username is given, check warnings of the given user.</td><td>N</td>
	</tr>
	<tr>
		<td>/clearwarns username [id]</td><td>/cwarns</td><td>wan.clear</td><td>Clears the warnings on username. If given an id, clear the specified warning from username.</td><td>N</td>
	</tr>
	<tr>
		<td>/modifywarn username id</td><td>/mwarn</td><td>wan.edit</td><td>Modify an existing warning.</td><td>N</td>
	</tr>
	<tr>
		<td>/twarns</td><td>N/A</td><td>wan.twarns</td><td>Toggle the ability for users to view there warnings without accessing the config file.</td><td>N</td>
	</tr>
	<tr>
		<td>/wan</td><td>N/A</td><td>N/A</td><td>View available commands.</td><td>N</td>
	</tr>
	<tr>
		<td>/wan reload</td><td>N/A</td><td>wan.reload</td><td>Reload WarningsAndNotes.</td><td>N</td>
	</tr>
	<tr>
		<td>/wan stats [warnings|notes]</td><td>N/A</td><td>wan.stats</td><td>Display all statistics OR just stats about [warnings|notes].</td><td>N</td>
	</tr>
</table>

