<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="html" />
	<xsl:template match="/galery">
		<table border="1">
			<xsl:apply-templates />
		</table>
	</xsl:template>
	<xsl:template match="/galery/flower">
		<tr>
			<xsl:apply-templates />
		</tr>
	</xsl:template>
	<xsl:template match="/galery/flower/name">
		<td>
			<xsl:value-of select="text()" />
		</td>
	</xsl:template>
	<xsl:template match="/galery/flower/soil">
		<td>
			<xsl:value-of select="text()" />
		</td>
	</xsl:template>
	<xsl:template match="/galery/flower/origin">
		<td>
			<xsl:value-of select="text()" />
		</td>
	</xsl:template>
	<xsl:template match="/galery/flower/visualParametrs">
		<tr>
			<xsl:apply-templates />
		</tr>
	</xsl:template>
	<xsl:template match="/galery/flower/visualParametrs/colour">
		<td>
			<xsl:value-of select="text()" />
		</td>
	</xsl:template>
	<xsl:template match="/galery/flower/visualParametrs/length">
		<td>
			<xsl:value-of select="text()" />
		</td>
	</xsl:template>
	<xsl:template match="/galery/flower/growingTips">
		<tr>
			<xsl:apply-templates />
		</tr>
	</xsl:template>
	<xsl:template match="/galery/flower/growingTips/temperature">
		<td>
			<xsl:value-of select="text()" />
		</td>
	</xsl:template>
	<xsl:template match="/galery/flower/growingTips/watering">
		<td>
			<xsl:value-of select="text()" />
		</td>
	</xsl:template>
	<xsl:template match="/galery/flower/multiplying">
		<td>
			<xsl:value-of select="text()" />
		</td>
	</xsl:template>
</xsl:stylesheet>