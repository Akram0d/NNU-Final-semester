# Generated by Django 4.0.2 on 2022-02-27 03:11

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('login_registration_app', '0001_initial'),
    ]

    operations = [
        migrations.AlterField(
            model_name='service',
            name='description',
            field=models.TextField(default='goodn'),
        ),
        migrations.AlterField(
            model_name='worker',
            name='desc',
            field=models.TextField(default='good'),
        ),
    ]